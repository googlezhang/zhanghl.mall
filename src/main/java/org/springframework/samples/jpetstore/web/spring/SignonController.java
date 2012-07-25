package org.springframework.samples.jpetstore.web.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.samples.jpetstore.domain.Account;
import org.springframework.samples.jpetstore.domain.logic.PetStoreFacade;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.zhanghl.mall.log4jexample.TestLog4j;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
public class SignonController implements Controller {
    final Logger logger = LoggerFactory.getLogger(TestLog4j.class);
    Integer t;
    Integer oldT;
    public void setTemperature(Integer temperature) {
        oldT = t;
        t = temperature;
        logger.error("Temperature set to {}. Old temperature was {}.", t, oldT);
        if (temperature.intValue() > 50) {
            logger.info("Temperature has risen above 50 degrees.");
        }
    }

	private PetStoreFacade petStore;

	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    setTemperature(1);
        setTemperature(55);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Account account = this.petStore.getAccount(username, password);
		if (account == null) {
			return new ModelAndView("Error", "message", "Invalid username or password.  Signon failed.");
		}
		else {
			UserSession userSession = new UserSession(account);
			PagedListHolder myList = new PagedListHolder(this.petStore.getProductListByCategory(account.getFavouriteCategoryId()));
			myList.setPageSize(4);
			userSession.setMyList(myList);
			request.getSession().setAttribute("userSession", userSession);
			String forwardAction = request.getParameter("forwardAction");
			if (forwardAction != null) {
				response.sendRedirect(forwardAction);
				return null;
			}
			else {
				return new ModelAndView("index");
			}
		}
	}

}
