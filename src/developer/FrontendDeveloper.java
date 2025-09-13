package developer;

import designer.Designer;
import worker.Worker;

public class FrontendDeveloper extends Developer{
    public FrontendDeveloper(String name, String programmingLanguage) {
        super(name, programmingLanguage);
    }

    @Override
    public void pray() {
        System.out.println("=========================================");
        System.out.println("🙏 " + name + "은(는) 오늘도 버그 없는 UI를 위해 기도합니다. 🙏");
    }

    @Override
    public void work() {
        System.out.println("=========================================");

        switch (rand.nextInt(5)) {
            case 0:
                System.out.println("🎨 새로운 UI 컴포넌트를 제작했습니다.");
                System.out.println("✨ 화면이 더 직관적으로 변했습니다.");
                System.out.println("😵 CSS 버그 때문에 애를 먹었습니다.");
                System.out.println("📊 [스트레스: 중간~높음 | 성취: 보통~높음]");
                addStress(rand.nextInt(4, 9));
                addKnowledge(rand.nextInt(3, 7));
                break;

            case 1:
                System.out.println("📱 반응형 레이아웃을 구현했습니다.");
                System.out.println("📐 다양한 디바이스에서 작동하는 걸 확인하며 성취감을 느꼍습니다.");
                System.out.println("🤯 브라우저 호환성 문제가 스트레스였습니다.");
                System.out.println("📊 [스트레스: 높음 | 성취: 높음]");
                addStress(rand.nextInt(5, 10));
                addKnowledge(rand.nextInt(4, 8));
                break;

            case 2:
                System.out.println("🐛 자잘한 렌더링 버그를 수정했습니다.");
                System.out.println("🔍 DOM 이해도가 한층 깊어졌습니다.");
                System.out.println("😓 작은 오류를 찾느라 시간이 오래 걸렸습니다.");
                System.out.println("📊 [스트레스: 중간 | 성취: 보통]");
                addStress(rand.nextInt(3, 6));
                addKnowledge(rand.nextInt(3, 6));
                break;

            case 3:
                System.out.println("⚡ 성능 최적화를 위해 이미지 압축과 코드 스플리팅을 적용했습니다.");
                System.out.println("🚀 로딩 속도가 빨라져 뿌듯합니다.");
                System.out.println("😵 캐시 문제로 예상치 못한 오류가 발생했습니다.");
                System.out.println("📊 [스트레스: 중간~높음 | 성취: 높음]");
                addStress(rand.nextInt(4, 8));
                addKnowledge(rand.nextInt(4, 8));
                break;

            case 4:
                System.out.println("📝 컴포넌트 사용 가이드를 작성했습니다.");
                System.out.println("📚 동료들이 쉽게 이해할 수 있도록 정리했습니다.");
                System.out.println("😮‍💨 문서화 과정이 지루하게 느껴졌습니다.");
                System.out.println("📊 [스트레스: 낮음~중간 | 성취: 보통]");
                addStress(rand.nextInt(2, 5));
                addKnowledge(rand.nextInt(3, 6));
                break;
        }
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void ask(Worker target){
        new Thread(() -> {
            while(true){
                try{
                    int delay = rand.nextInt(8, 60) * 1000;
                    Thread.sleep(delay);
                } catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                System.out.println("=========================================");
                if (target.getStress() >= 80){
                    System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 지금 너무 힘들어 보여요. 잠시 쉬는 게 어떨까요?");
                } else{
                    // 하드 코딩한 레전드 코드 ㅋㅋ
                    if (target.getClass() == Worker.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 클릭 테스트라도 좀 해주시면 안 돼요?"); break;
                            case 1: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 버튼 눌러봤는데 피드백이 없어요. 확인 좀 해주세요."); break;
                            case 2: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 화면 깨진 거 보이시죠? 제보라도 해주세요!"); break;
                        }
                    }
                    else if (target.getClass() == Developer.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, API 응답 형식 또 바뀌었어요?"); break;
                            case 1: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 문서랑 실제랑 달라서 프론트에서 또 막혔습니다!"); break;
                            case 2: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 테스트용 데이터라도 좀 넣어주세요."); break;
                        }
                    }
                    else if (target.getClass() == Designer.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 시안이랑 실제 반응형 화면이 달라요!"); break;
                            case 1: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 다크모드 디자인도 부탁드려요!"); break;
                            case 2: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 상태별(에러/로딩) 디자인은 어디 갔나요?"); break;
                        }
                    }
                    else if (target.getClass() == FrontendDeveloper.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 이번엔 누구 CSS가 덮어씌운 거죠?"); break;
                            case 1: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 공용 컴포넌트 수정하셨죠? 화면 다 깨졌어요!"); break;
                            case 2: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 코드 리뷰 좀 빨리 해주세요. 막혔습니다!"); break;
                        }
                    }
                    else if (target.getClass() == BackEndDeveloper.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, API 호출하면 500 에러 또 터지는데요?"); break;
                            case 1: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 응답에 필요한 필드가 또 빠졌어요."); break;
                            case 2: System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, CORS 에러 또 났습니다. 서버 확인 좀 해주세요!"); break;
                        }
                    }
                    else {
                        System.out.println("🎨 FrontendDeveloper : " + target.getName() + "님, 당신 누구세요?");
                    }
                    target.addStress(rand.nextInt(4, 8));
                    System.out.printf("💡 %s의 현재 상태 | 스트레스: %d, 지식: %d\n", target.getName(), target.getStress(), target.getKnowledge());
                }
            }
        }).start();
    }
}
