package com;

public class Main {

    public static void main(String[] args) {

        SortTester sortTester = new SortTester();
        Pair<Long, Long> result;

        System.out.println("runCrater=1");

        //WARM
        sortTester.test(50, 1000, 1, 1024);
        //RUN
        result = sortTester.test(50, 1000, 1, 1024);

        System.out.println("TEST SMALL ARRAY SIZE=50");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(150, 1000, 1, 1024);
        //RUN
        result = sortTester.test(150, 1000, 1, 1024);

        System.out.println("TEST MEDIUM ARRAY SIZE=150");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(1000, 1000, 1, 1024);
        //RUN
        result = sortTester.test(1000, 1000, 1, 1024);

        System.out.println("TEST BIG ARRAY SIZE=1000");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(100000, 1000, 1, 1024);
        //RUN
        result = sortTester.test(100000, 1000, 1, 1024);

        System.out.println("TEST SUPER BIG ARRAY SIZE=100000");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));


        System.out.println("runCrater=10");

        //WARM
        sortTester.test(50, 1000, 10, 1024);
        //RUN
        result = sortTester.test(50, 1000, 10, 1024);

        System.out.println("TEST SMALL ARRAY SIZE=50");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(150, 1000, 10, 1024);
        //RUN
        result = sortTester.test(150, 1000, 10, 1024);

        System.out.println("TEST MEDIUM ARRAY SIZE=150");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(1000, 1000, 10, 1024);
        //RUN
        result = sortTester.test(1000, 1000, 10, 1024);

        System.out.println("TEST BIG ARRAY SIZE=1000");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(100000, 1000, 10, 1024);
        //RUN
        result = sortTester.test(100000, 1000, 10, 1024);

        System.out.println("TEST SUPER BIG ARRAY SIZE=1000000");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));


        System.out.println("runCrater=100");

        //WARM
        sortTester.test(50, 1000, 100, 1024);
        //RUN
        result = sortTester.test(50, 1000, 100, 1024);

        System.out.println("TEST SMALL ARRAY SIZE=50");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(150, 1000, 100, 1024);
        //RUN
        result = sortTester.test(150, 1000, 100, 1024);

        System.out.println("TEST MEDIUM ARRAY SIZE=150");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(1000, 1000, 100, 1024);
        //RUN
        result = sortTester.test(1000, 1000, 100, 1024);

        System.out.println("TEST BIG ARRAY SIZE=1000");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(100000, 1000, 100, 1024);
        //RUN
        result = sortTester.test(100000, 1000, 100, 1024);

        System.out.println("TEST SUPER BIG ARRAY SIZE=100000");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));



        System.out.println("runCrater=1000");

        //WARM
        sortTester.test(50, 1000, 1000, 1024);
        //RUN
        result = sortTester.test(50, 1000, 1000, 1024);

        System.out.println("TEST SMALL ARRAY SIZE=50");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(150, 1000, 1000, 1024);
        //RUN
        result = sortTester.test(150, 1000, 1000, 1024);

        System.out.println("TEST MEDIUM ARRAY SIZE=150");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(1000, 1000, 1000, 1024);
        //RUN
        result = sortTester.test(1000, 1000, 1000, 1024);

        System.out.println("TEST BIG ARRAY SIZE=1000");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));

        //WARM
        sortTester.test(100000, 1000, 1000, 1024);
        //RUN
        result = sortTester.test(100000, 1000, 1000, 1024);

        System.out.println("TEST SUPER BIG ARRAY SIZE=100000");
        System.out.println("SDK TIME = " + result.first/(1000*1000));
        System.out.println("CRATER TIME = " + result.second/(1000*1000));
        System.out.println((result.first - result.second)/(1000*1000));
    }

}
