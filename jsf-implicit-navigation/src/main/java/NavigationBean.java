
import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "navigationBean")
@ViewScoped
public class NavigationBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public String goToOptionA() {
		return "option-a";
	}

	public String goToOptionB() {
		return "option-b";
	}
	
}
