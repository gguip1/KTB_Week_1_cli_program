import bgmplayer.BgmPlayer;
import designer.Designer;
import developer.BackEndDeveloper;
import developer.Developer;
import developer.FrontendDeveloper;
import worker.Worker;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    Worker player;
    String name;
    String skill;
    Worker[] workers = new Worker[4];

    public void gameStart(){
        // 배경음악 재생
        playBGM();

        // 게임 설정 (player, name, skill)
        gameSetup();

        // 게임 메인 루프
        gameLoop();
    }

    private void playBGM(){
        Thread bgmThread = new Thread(new BgmPlayer("./resources/307a3f44.wav"));
        bgmThread.setDaemon(true);
        bgmThread.start();
    }

    private void gameSetup(){
        System.out.println("=========================================");
        System.out.println("👋 안녕하세요! 직업 시뮬레이터에 오신 것을 환영합니다!");
        System.out.print("👋 이름을 입력해주세요: ");
        name = sc.nextLine().trim();

        while(true){
            System.out.println("=========================================");
            System.out.println("💼 직업을 선택해주세요!");
            System.out.println("1️⃣ 개발자");
            System.out.println("2️⃣ 프론트엔드 개발자");
            System.out.println("3️⃣ 백엔드 개발자");
            System.out.println("4️⃣ 디자이너");
            System.out.print("👉 번호를 입력하세요: ");

            int choice;
            try{
                choice = Integer.parseInt(sc.nextLine().trim()); // nextInt() 사용 시 Enter키가 버퍼에 남아 다음 입력에 영향
            } catch (NumberFormatException e){
                System.out.print("=========================================\n⚠️ 잘못 입력하셨습니다. 다시 입력해주세요.\n"); continue;
            }

            System.out.println("=========================================");
            switch (choice){
                case 0:
                    System.out.println("""
                        특수 직업을 찾으셨군요!
                        당신은 노동자입니다.
                        오늘도 땀 흘리며 일터를 지키세요.
                        언젠가 근로기준법이 지켜질 날을 기원합니다...""");
                    player = new Worker(name);
                    workers = new Worker[]{
                            new Developer("Alice", "Java"),
                            new FrontendDeveloper("Bob", "JavaScript"),
                            new BackEndDeveloper("Charlie", "Python"),
                            new Designer("Diana", "Figma")
                    };
                    break;
                case 1:
                    System.out.print("""
                        개발자를 선택하셨습니다!
                        축하합니다. 이제 당신의 인생은 끝없는 디버깅과 커밋 메시지 작성으로 채워질 것입니다.
                        "한 줄 고쳤는데 왜 전체가 터졌지?"라는 의문을 평생 안고 살아야 할지도 모릅니다.
                        주 언어를 입력해주세요 (※ "엑셀"이라고 하면 시스템이 조금 서운합니다):\s""");
                    skill = sc.nextLine().trim();

                    if (skill.equals("엑셀")){
                        System.out.println("=========================================");
                        System.out.println("\uD83E\uDD16 시스템이 서운합니다.");
                    }

                    player = new Developer(name, skill);
                    workers = new Worker[]{
                            new Worker("John"),
                            new FrontendDeveloper("Bob", "JavaScript"),
                            new BackEndDeveloper("Charlie", "Python"),
                            new Designer("Diana", "Figma")
                    };
                    break;
                case 2:
                    System.out.print("""
                        프론트엔드 개발자를 선택하셨습니다!
                        화면은 화려하지만, 그 뒤엔 눈물과 console.log가 숨어 있습니다...
                        브라우저마다 다르게 보이는 UI와 매일 전쟁을 벌이게 될 것입니다.
                        이제 당신의 주 언어를 고르세요 (JS? TS? 아니면... JQuery?):\s""");
                    skill = sc.nextLine().trim();

                    player = new FrontendDeveloper(name, skill);
                    workers = new Worker[]{
                            new Worker("John"),
                            new Developer("Alice", "Java"),
                            new BackEndDeveloper("Charlie", "Python"),
                            new Designer("Diana", "Figma")
                    };
                    break;
                case 3:
                    System.out.print("""
                        백엔드 개발자를 선택하셨습니다!
                        서버가 터지는 순간, 모든 비난은 당신에게 쏟아질 것입니다.
                        "DB가 왜 이렇게 느려요?"라는 질문은 이제 당신의 일상입니다.
                        어떤 언어로 서버를 지탱하시겠습니까?:\s""");
                    skill = sc.nextLine().trim();

                    player = new BackEndDeveloper(name, skill);
                    workers = new Worker[]{
                            new Worker("John"),
                            new Developer("Alice", "Java"),
                            new FrontendDeveloper("Bob", "JavaScript"),
                            new Designer("Diana", "Figma")
                    };
                    break;
                case 4:
                    System.out.print("""
                        디자이너를 선택하셨습니다!
                        픽셀 하나 차이로도 클라이언트의 운명이 바뀔 수 있습니다.
                        무한한 수정 요청과 끝나지 않는 야근의 세계에 들어오신 걸 환영합니다.
                        당신의 대표 도구를 입력해주세요 (예: Figma, Photoshop, MS Paint?):\s""");
                    skill = sc.nextLine().trim();

                    player = new Designer(name, skill);
                    workers = new Worker[]{
                            new Worker("John"),
                            new Developer("Alice", "Java"),
                            new FrontendDeveloper("Bob", "JavaScript"),
                            new BackEndDeveloper("Charlie", "Python")
                    };
                    break;
                default: System.out.print("=========================================\n⚠️ 잘못 입력하셨습니다. 다시 입력해주세요.\n"); continue;
            }
            break;
        }
    }

    private void gameLoop(){
        for(Worker worker : workers){
            worker.ask(player);
        }

        while(!gameEnd()){
            if(player instanceof Developer){
                while(true){
                    System.out.println("""
                        =========================================
                        💼 행동 선택
                        1. 🛠️ 일하기
                        2. 🌴 휴가가기
                        3. 🙏 기도하기
                        👉 다음 행동을 선택해주세요:\s""");

                    int choice;
                    try{
                        choice = Integer.parseInt(sc.nextLine().trim()); // nextInt() 사용 시 Enter키가 버퍼에 남아 다음 입력에 영향
                    } catch (NumberFormatException e){
                        System.out.print("=========================================\n⚠️ 잘못 입력하셨습니다. 다시 입력해주세요.\n"); continue;
                    }

                    switch (choice){
                        case 1: player.work(); break;
                        case 2: player.vacation(); break;
                        case 3: ((Developer) player).pray(); break;
                        default: System.out.print("=========================================\n⚠️ 잘못 입력하셨습니다. 다시 입력해주세요.\n"); continue;
                    }
                    break;
                }
            }else{
                while(true){
                    System.out.println("""
                        =========================================
                        💼 행동 선택
                        1. 🛠️ 일하기
                        2. 🌴 휴가가기
                        👉 다음 행동을 선택해주세요:\s""");

                    int choice;
                    try{
                        choice = Integer.parseInt(sc.nextLine().trim()); // nextInt() 사용 시 Enter키가 버퍼에 남아 다음 입력에 영향
                    } catch (NumberFormatException e){
                        System.out.print("=========================================\n⚠️ 잘못 입력하셨습니다. 다시 입력해주세요.\n"); continue;
                    }

                    switch (choice){
                        case 1:
                            player.work(); break;
                        case 2: player.vacation(); break;
                        default: System.out.print("=========================================\n⚠️ 잘못 입력하셨습니다. 다시 입력해주세요.\n"); continue;
                    }
                    break;
                }
            }

            System.out.println("=========================================");
            System.out.printf("💡 %s의 현재 상태 | 스트레스: %d, 지식: %d\n", player.getName(), player.getStress(), player.getKnowledge());
        }

        System.exit(0);
    }

    private boolean gameEnd(){
        if (player.getStress() <= 20 && player.getKnowledge() >= 100) {
            System.out.println("=========================================");
            System.out.println("🎉 시스템이 감동해서 눈물을 흘립니다... (물은 안 나옵니다)");
            System.out.println("🚀 당신의 지식은 서버를 과부하 시켰습니다! 축하합니다!");
            return true;
        }

        if (player.getStress() >= 100) {
            System.out.println("=========================================");
            System.out.println("💀 스트레스가 100을 돌파했습니다. 이제 당신은 커피머신과 대화합니다.");
            System.out.println("⚠️ IDE가 '인간 과부하 오류(404 휴식 Not Found)'를 출력합니다.");
            System.out.println("=========================================");
            return true;
        }

        if (-10 >= player.getKnowledge()){
            System.out.println("=========================================");
            System.out.println("🧟‍♂️ 지식이 -10을 돌파했습니다. 이제 당신은 좀비가 되어 무의미한 반복 작업만 합니다.");
            System.out.println("⚠️ IDE가 '지식 부족 오류(418 나는 커피가 아니다)'를 출력합니다.");
            System.out.println("=========================================");
            return true;
        }

        return false;
    }
}
