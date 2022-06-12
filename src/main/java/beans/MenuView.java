package beans;

import javax.faces.bean.ManagedBean;
@ManagedBean

public class MenuView {

private String orientation;

    public String getOrientation() {

        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }


}
