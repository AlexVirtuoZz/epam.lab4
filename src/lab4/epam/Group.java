package lab4.epam;

/**
 * Created by virtuoz on 12.05.16.
 */
public enum Group {
    /**
     * Group is described by its name
     */
    FRIENDS("friends"), JOB("job"), FAMILY("family");

    String groupName;

    Group(String groupName){
        this.groupName = groupName;
    }
}
