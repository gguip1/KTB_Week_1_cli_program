package developer;

import designer.Designer;
import worker.Worker;

public class Developer extends Worker {
    protected String programmingLanguage;

    public Developer(String name, String programmingLanguage){
        super(name);
        this.programmingLanguage = programmingLanguage;
    }

    public void pray(){
        System.out.println("=========================================");
        System.out.println("🙏" + name + "은(는) 오늘도 버그 없는 코드를 위해 기도합니다. 🙏");

        addStress(-1);
    }

    @Override
    public void work() {
        System.out.println("=========================================");

        switch (rand.nextInt(5)) {
            case 0:
                System.out.println("💻 오늘은 " + programmingLanguage + " 언어로 코드를 작성했습니다.");
                System.out.println("🚀 기능이 정상 동작할 때 성취감을 느꼍습니다.");
                System.out.println("🐛 하지만 디버깅 과정이 스트레스였습니다.");
                System.out.println("📊 [스트레스: 중간~높음 | 성취: 보통]");
                addStress(rand.nextInt(4, 9));
                addKnowledge(rand.nextInt(3, 6));
                break;

            case 1:
                System.out.println("📚 새로운 프레임워크를 공부했습니다.");
                System.out.println("✨ 성장하는 느낌이 듭니다.");
                System.out.println("😵 처음 배우는 개념이 어려워 부담스럽습니다.");
                System.out.println("📊 [스트레스: 중간 | 성취: 높음]");
                addStress(rand.nextInt(3, 6));
                addKnowledge(rand.nextInt(4, 8));
                break;

            case 2:
                System.out.println("🤝 팀 코드 리뷰에 참여했습니다.");
                System.out.println("🛠️ 동료들의 코드에서 배움이 많았습니다.");
                System.out.println("😤 지적을 받으니 살짝 스트레스가 쌓입니다.");
                System.out.println("📊 [스트레스: 중간 | 성취: 보통]");
                addStress(rand.nextInt(3, 7));
                addKnowledge(rand.nextInt(3, 6));
                break;

            case 3:
                System.out.println("🗂️ 프로젝트 구조를 리팩토링했습니다.");
                System.out.println("🔧 코드의 유지보수성이 개선되었습니다.");
                System.out.println("😮‍💨 시간이 오래 걸려 피곤합니다.");
                System.out.println("📊 [스트레스: 중간~높음 | 성취: 보통]");
                addStress(rand.nextInt(4, 8));
                addKnowledge(rand.nextInt(3, 6));
                break;

            case 4:
                System.out.println("📝 기술 블로그를 작성하며 지식을 정리했습니다.");
                System.out.println("📚 정리 과정에서 이해가 깊어졌습니다.");
                System.out.println("😵 긴 글을 쓰다 보니 집중력이 떨어졌습니다.");
                System.out.println("📊 [스트레스: 낮음~중간 | 성취: 높음]");
                addStress(rand.nextInt(2, 5));
                addKnowledge(rand.nextInt(4, 7));
                break;
        }
//        try {
//            Thread.sleep(1500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    @Override
    public void ask(Worker target) {
        new Thread(() -> {
            while (true) {
                try {
                    int delay = rand.nextInt(8, 60) * 1000;
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("=========================================");
                if (target.getStress() >= 80){
                    System.out.println("💻 Developer : " + target.getName() + "님, 지금 너무 힘들어 보여요. 잠시 쉬는 게 어떨까요?");
                } else {
                    if (target.getClass() == Worker.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("💻 Developer : " + target.getName() + "님, 단순 반복 작업은 자동화하면 더 빠른데요?"); break;
                            case 1: System.out.println("💻 Developer : " + target.getName() + "님, 이런 건 스크립트 짜면 하루 만에 끝납니다."); break;
                            case 2: System.out.println("💻 Developer : " + target.getName() + "님, 이거 엑셀 매크로라도 쓰셨으면 벌써 됐을걸요?"); break;
                        }
                    } else if (target.getClass() == Developer.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("💻 Developer : " + target.getName() + "님, 변수명 또 a, b, c로 하셨네요?"); break;
                            case 1: System.out.println("💻 Developer : " + target.getName() + "님, 유닛 테스트 하나도 없는데요?"); break;
                            case 2: System.out.println("💻 Developer : " + target.getName() + "님, 지난번 버그 그대로 재현됩니다!"); break;
                        }
                    } else if (target.getClass() == Designer.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("💻 Developer : " + target.getName() + "님, 시안이 너무 무겁습니다. 성능 고려 안 하셨나요?"); break;
                            case 1: System.out.println("💻 Developer : " + target.getName() + "님, 이 색상은 접근성 테스트 통과 안 될 것 같은데요?"); break;
                            case 2: System.out.println("💻 Developer : " + target.getName() + "님, 애니메이션 효과가 CPU 다 잡아먹습니다."); break;
                        }
                    } else if (target.getClass() == FrontendDeveloper.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("💻 Developer : " + target.getName() + "님, API 응답 처리 제대로 안 해서 화면 깨집니다."); break;
                            case 1: System.out.println("💻 Developer : " + target.getName() + "님, 또 CORS 에러 났는데 설정 확인 안 하셨어요?"); break;
                            case 2: System.out.println("💻 Developer : " + target.getName() + "님, 콘솔에 에러 로그 잔뜩인데 왜 무시하세요?"); break;
                        }
                    } else if (target.getClass() == BackEndDeveloper.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("💻 Developer : " + target.getName() + "님, API 문서랑 실제 응답 또 달라요!"); break;
                            case 1: System.out.println("💻 Developer : " + target.getName() + "님, DB 쿼리 느려서 페이지 로딩이 안 됩니다."); break;
                            case 2: System.out.println("💻 Developer : " + target.getName() + "님, 에러 코드 200인데 에러 메시지가 와요. 왜죠?"); break;
                        }
                    } else {
                        System.out.println("💻 Developer : " + target.getName() + "님, 당신 누구세요?");
                    }
                    target.addStress(rand.nextInt(4, 8));
                    System.out.printf("💡 %s의 현재 상태 | 스트레스: %d, 지식: %d\n", target.getName(), target.getStress(), target.getKnowledge());
                }
            }
        }).start();
    }
}
