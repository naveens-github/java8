package com.myproject.java8.sortingElementsUsingCollectionsLambda;

public class AnonymousInnerClassUsingLambdaExp {
    public static void main(String[] args) {
        Runnable r = ()-> {for (int i=1; i<10; i++) System.out.println("Anonymous inner class block");};
        Thread thread = new Thread(r);
        thread.start();
        for (int i=1 ; i<10; i++)
            System.out.println("Main method block");
    }
}

//Without lambda expression
/*public class AnonymousInnerClassUsingLambdaExp {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<10; i++)
                    System.out.println("Anonymous inner class block");
            }
        };
        Thread thread = new Thread(r);
        thread.start();
        for (int i=1; i<10; i++)
            System.out.println("Main method block");
    }
}*/