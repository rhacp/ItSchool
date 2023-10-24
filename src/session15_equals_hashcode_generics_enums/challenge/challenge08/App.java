package session15_equals_hashcode_generics_enums.challenge.challenge08;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        RunningAppAction firstApp = new RunningAppAction();
        System.out.println("Running App Action: ");
        firstApp.setAppId("0001");
        firstApp.setAction("Opened AutoCAD");
        System.out.println("");

        RunningAppAction secondApp = new RunningAppAction();
        System.out.println("Running App Action:");
        secondApp.setAppId("0001");
        secondApp.setAction("Create new project with AutoCAD");
        System.out.println("");

        System.out.println("The ID of the first two object is the same since they are the same app running on the machine, " +
                "but the comment describing the action is different because the action regarding the app is different. " +
                "We want to store the app as running only once, so we made the hashCode to be the same if the ID " +
                "is the same (same app). This way, the Cache will story only the running app.");
        System.out.println("");

        RunningAppAction thirdApp = new RunningAppAction();
        System.out.println("Running App Action:");
        thirdApp.setAppId("0002");
        thirdApp.setAction("Opened 3DsMax");
        System.out.println("");

        ArrayList<RunningAppAction> cacheApps = new ArrayList<>();

        System.out.println("Add first RunningAppAction to cache:");
        addAppActionToCacheRunningAppList(firstApp, cacheApps);
        System.out.println("");

        System.out.println("Add second RunningAppAction to cache:");
        addAppActionToCacheRunningAppList(secondApp, cacheApps);
        System.out.println("");

        System.out.println("Add third RunningAppAction to cache:");
        addAppActionToCacheRunningAppList(thirdApp, cacheApps);
        System.out.println("");

        System.out.println("Current apps stored as running in the cached:");
        System.out.println(cacheApps);
    }

    private static void addAppActionToCacheRunningAppList(RunningAppAction app, ArrayList<RunningAppAction> cache) {
        int help = 0;
        for (RunningAppAction element : cache) {
            if (app.hashCode() == element.hashCode()) {
                System.out.println("This app is already stored as running in the cache.");
                help = 1;
                break;
            }
        }
        if (help == 0) {
            cache.add(app);
            System.out.println("App stored as running in the cache.");
        }
    }
}
