# Проект Java&Script: тестирование

Тестовое задание для "КОРУС КОНСАЛТИНГ СНГ"
<details><summary>ТЗ:</summary>
Необходимо произвести рефакторинг кода класса Finder с применением stream api.
</details>

'Source Code:'

 ```javascript
 public class Finder {

    /**
    * Поиск групп людей старше определенного возраста.
    *
    * @param groups группы
    * @param targetAge возраст для поиска
    * @return список имен групп из списка групп старше возраста targetAge
    */
    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = new HashSet<>();
        for (MembersGroup membersGroup : groups) {
            for (Member member : membersGroup.getMembers()) {
                if (member.getAge() > targetAge) {
                    String name = member.getName();
                    groupsNames.add(name);
                }
            }
        }
        return groupsNames;
    }
 }
 ```