package GoodCode;

public class GoodUser {
    // We will construct user Object step by step
    // Just like a sandwitch : Bread -> butter -> veggies -> sauces -> mayo -> others...
    private String username;
    private String password;
    private String email;
    // step 1 - Constructor ko private kr do taki koi direct User na bana paye
    private GoodUser(){

    }
    public String getUsername() {
        return username;
    }
    public static class UserBuilder{
        private String username;
        private String password;
        private String email;
        public UserBuilder setUsername(String username){
            this.username = username;
            return this;
        }
        public UserBuilder setPassword(String password){
            this.password = password;
            return this;
        }
        public UserBuilder setEmail(String email){
            this.email = email;
            return this;
        }
        public GoodUser build(){
            GoodUser goodUser = new GoodUser();
            goodUser.username = username;
            goodUser.password = password;
            goodUser.email = email;

            return goodUser;
        }
    }
}
