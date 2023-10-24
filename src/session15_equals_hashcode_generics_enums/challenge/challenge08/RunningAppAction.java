package session15_equals_hashcode_generics_enums.challenge.challenge08;

import java.util.Objects;

public class RunningAppAction {

    private String appId;
    private String action;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
        System.out.println("App ID set to: " + appId);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
        System.out.println("Action set to: " + action);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RunningAppAction that = (RunningAppAction) o;
        return Objects.equals(getAppId(), that.getAppId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppId());
    }

    @Override
    public String toString() {
        return "RunningAppAction{" +
                "appId='" + appId + '\'' +
                '}';
    }
}
