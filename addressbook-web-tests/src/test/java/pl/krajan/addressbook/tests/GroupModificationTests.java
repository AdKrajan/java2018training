package pl.krajan.addressbook.tests;

import org.testng.annotations.Test;
import pl.krajan.addressbook.model.GroupData;

/**
 * Created by adamk on 15.11.2018
 **/
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("modName", "modHeader", "modFooter"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
