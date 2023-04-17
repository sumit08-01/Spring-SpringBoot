

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class IcecreamController extends SimpleFormController {

    public IcecreamController() {
    }
    
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception{
       
	   Icecream icecream = (Icecream) command;
       return new ModelAndView(getSuccessView(),"icecream",icecream);
    	}
}


