package com.zhanghl.mall.web.spring.controller.regist;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.octo.captcha.module.servlet.image.SimpleImageCaptchaServlet;
import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.multitype.MultiTypeCaptchaService;
import com.zhanghl.mall.formobject.PersonForm;
import com.zhanghl.mall.formobject.validator.RegistrationValidation;

/**
 * 注册控制器 类RegistController.java的实现描述：包含个人用户注册，企业用户注册，和校园用户注册
 * 
 * @author hongliang.zhanghl 2012-7-24 下午10:25:41
 */
@Controller
@SessionAttributes("registrationForm")
public class RegistController {

    public static final String      FORM_NAME = "registrationForm";

    final Logger                    logger    = LoggerFactory.getLogger(RegistController.class);

    @Autowired
    MessageSource                   messageSource;
    @Autowired
    private RegistrationValidation  registrationValidation;
    @Autowired
    private MultiTypeCaptchaService captchaService;

    @RequestMapping("/new/registpersonal.htm")
    public String RegistPersonal() {
        return "regist/registpersonal";
    }

    @RequestMapping("/new/registcompany.htm")
    public String RegistCompany() {
        return "regist/registcompany";
    }

    @RequestMapping("/new/registschool.htm")
    public String RegistSchool() {
        return "regist/registschool";
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping(value = "/new/registtest.htm", method = RequestMethod.GET)
    public String CreateRegistTestForm(Model model) {
        PersonForm personForm = new PersonForm();
        model.addAttribute("personForm", personForm);
        return "regist/registtest";
    }

    @RequestMapping(value = "/new/registtest.htm", method = RequestMethod.POST)
    public String processRegistration(@Valid
    PersonForm personForm, BindingResult result, HttpServletRequest request) {
        registrationValidation.validate(personForm, result);
        // validateCaptcha(personForm, result, request.getSession().getId(), "registration.captcha");
        validateCaptchaSimple(personForm, result, request, "registration.captcha");
        if (result.hasErrors()) {
            return "regist/registtest";
        }
        return "regist/registtest";
    }

    private void validateCaptchaSimple(PersonForm personForm, BindingResult result, HttpServletRequest request,
                                       String errorCode) {
        if (null != result.getFieldError("captcha")) return;
        boolean validCaptcha = false;
        try {
            // validCaptcha = captchaService.validateResponseForID(sessionId, personForm.getCaptcha());
            validCaptcha = SimpleImageCaptchaServlet.validateResponse(request, personForm.getCaptcha());
        } catch (CaptchaServiceException e) {
            // should not happen, may be thrown if the id is not valid
            logger.warn("validateCaptcha()", e);
        }
        if (!validCaptcha) {
            result.rejectValue("captcha", errorCode);
        }

    }

    protected void validateCaptcha(PersonForm personForm, BindingResult result, String sessionId, String errorCode) {
        // If the captcha field is already rejected
        if (null != result.getFieldError("captcha")) return;
        boolean validCaptcha = false;
        try {
            validCaptcha = captchaService.validateResponseForID(sessionId, personForm.getCaptcha());
        } catch (CaptchaServiceException e) {
            // should not happen, may be thrown if the id is not valid
            logger.warn("validateCaptcha()", e);
        }
        if (!validCaptcha) {
            result.rejectValue("captcha", errorCode);
        }
    }
}
