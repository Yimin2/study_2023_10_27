package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    String name;
    String content;
    Scanner scanner;
    int count;
    List<Saying> sayings;

    App() {
        count = 1;
        scanner = new Scanner(System.in);
        sayings = new ArrayList<>();
    }

    void run() {
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령 : ");
            String cmd = scanner.nextLine();
            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                regit();
            } else if (cmd.equals("목록")) {
                list();
            }
        }
    }

    void regit() {
        System.out.print("명언 : ");
        content = scanner.nextLine();
        System.out.print("작가 : ");
        name = scanner.nextLine();
        System.out.printf("%d번 명령이 등록되었습니다.\n", count);
        Saying saying = new Saying(count, content, name);
        sayings.add(saying);
        count++;
    }

    void list() {
        for (int i = sayings.size() - 1; i >= 0; i--) {
            Saying saying = sayings.get(i);
            System.out.printf("%d / %s / %s\n", saying.id, saying.name, saying.content);
        }
    }
}
