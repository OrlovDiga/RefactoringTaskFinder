import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFinder {

    @Test
    public void testFindOldMembers() {
        //create member's lists
        List<Member> a = Arrays.asList(new Member("Petya", 16), new Member("Ann", -1));
        List<Member> b = Arrays.asList(new Member("Vasya", 19), new Member("Dmitry", 11));
        List<Member> c = Arrays.asList(new Member("Vera", 13), new Member("Vlad", 12));

        //create groups for members
        MembersGroup group1 = new MembersGroup("firstGroup", a);
        MembersGroup group2 = new MembersGroup("secondGroup", b);
        MembersGroup group3 = new MembersGroup("thirdGroup", c);

        //create list of groups
        List<MembersGroup> listGroups = Arrays.asList(group1, group2, group3);

        //checked
        assertEquals(new HashSet<>(Arrays.asList("Petya", "Vlad", "Vera", "Vasya")), Finder.findOldMembers(listGroups, 11));
    }
}
