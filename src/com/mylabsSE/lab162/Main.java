package com.mylabsSE.lab162;

public class Main {
    public static void main(String[] args) {
User user=new User("Kostya");
     user.addPerm(User.PermAction.USER_CHANGE);
     user.addPerm(User.PermAction.USER_CHANGE);
     user.addPerm(User.PermAction.USER_CHANGE);
     user.addPerm(User.PermAction.USER_CHANGE);
     user.addPerm(User.PermAction.USER_READ);

        System.out.println(user.getPerm());
    }
}
