import GoodCode.GoodUser;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GoodUser goodUser = new GoodUser.UserBuilder()
                                .setUsername("@v_sha.w")
                                .setPassword("12345")
                                .setEmail("vkshaw@test.com").build();

        GoodUser user2 = new GoodUser.UserBuilder()
                             .setUsername("Vishal")
                             .setPassword("12345")
                              .build();
        System.out.println(goodUser.getUsername());
        System.out.println(user2.getUsername());
    }
}