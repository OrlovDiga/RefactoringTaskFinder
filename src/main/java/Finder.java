import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Finder {
    /**
     * Поиск групп людей старше определенного возраста.
     *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */

    //added static for method
    public static Set<String> findOldMembers(List<MembersGroup> groups, final int targetAge) {
        return groups.stream()
                  .flatMap(membersGroup -> membersGroup.getMembers()
                                                       .stream()
                                                       .filter(member -> member.getAge() > targetAge))
                  .map(Member::getName).collect(Collectors.toSet());
    }
}