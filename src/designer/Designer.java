package designer;

import developer.BackEndDeveloper;
import developer.Developer;
import developer.FrontendDeveloper;
import worker.Worker;

public class Designer extends Worker {
    protected String tool;

    public Designer(String name, String tool){
        super(name);
        this.tool = tool;
    }

    @Override
    public void work() {
        System.out.println("=========================================");

        switch (rand.nextInt(5)) {
            case 0:
                System.out.println("📝 와이어프레임을 제작해 기초 구조를 잡았습니다.");
                System.out.println("📐 사용자의 흐름을 설계하며 UX의 기본을 배웠습니다.");
                System.out.println("😵 반복되는 수정 요청이 스트레스의 원인입니다.");
                System.out.println("📊 [스트레스: 중간~높음 | 성취: 보통]");
                addStress(rand.nextInt(4, 9));
                addKnowledge(rand.nextInt(2, 5));
                break;

            case 1:
                System.out.println("🎨 새로운 시안을 완성했습니다!");
                System.out.println("✨ 팀원들이 만족해 성취감이 큽니다.");
                System.out.println("😓 하지만 짧은 마감 기한이 부담스럽습니다.");
                System.out.println("📊 [스트레스: 중간 | 성취: 높음]");
                addStress(rand.nextInt(3, 6));
                addKnowledge(rand.nextInt(4, 8));
                break;

            case 2:
                System.out.println("🤝 클라이언트 피드백을 받아 디자인을 수정했습니다.");
                System.out.println("🔄 협업 과정을 통해 배움은 있었지만 쉽지 않았습니다.");
                System.out.println("😤 끝없는 요구 변경이 큰 스트레스였습니다.");
                System.out.println("📊 [스트레스: 매우 높음 | 성취: 낮음~보통]");
                addStress(rand.nextInt(6, 12));
                addKnowledge(rand.nextInt(2, 5));
                break;

            case 3:
                System.out.println("📱 반응형 디자인을 적용하여 모바일 환경을 개선했습니다.");
                System.out.println("📐 다양한 디바이스에서 테스트하며 섬세한 조정을 배웠습니다.");
                System.out.println("🤯 기기별로 깨지는 UI를 맞추느라 골치가 아팠습니다.");
                System.out.println("📊 [스트레스: 높음 | 성취: 보통~높음]");
                addStress(rand.nextInt(5, 10));
                addKnowledge(rand.nextInt(3, 7));
                break;

            case 4:
                System.out.println("📚 디자인 트렌드를 조사하고 새로운 인사이트를 얻었습니다.");
                System.out.println("💡 최신 흐름을 반영할 수 있게 되었습니다.");
                System.out.println("😩 빠르게 변하는 트렌드를 따라가려니 피로감이 있습니다.");
                System.out.println("📊 [스트레스: 낮음~중간 | 성취: 보통]");
                addStress(rand.nextInt(2, 5));
                addKnowledge(rand.nextInt(3, 7));
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
                    System.out.println("🎨 Designer : " + target.getName() + "님이 잠시 쉬는게 좋을 것 같습니다. 너무 힘들어 보여요.");
                } else {
                    if (target.getClass() == Worker.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 Designer : " + target.getName() + "님, 작업물 좀 깔끔하게 정리해주시면 안 될까요?"); break;
                            case 1: System.out.println("🎨 Designer : " + target.getName() + "님, 이거 배치가 너무 삐뚤빼뚤해요!"); break;
                            case 2: System.out.println("🎨 Designer : " + target.getName() + "님, 이런 디테일을 놓치시면 완성도가 떨어져요."); break;
                        }
                    } else if (target.getClass() == Developer.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 Designer : " + target.getName() + "님, 디자인 시안이랑 실제 화면이 너무 달라요!"); break;
                            case 1: System.out.println("🎨 Designer : " + target.getName() + "님, 왜 또 폰트 크기 임의로 바꾸셨어요?"); break;
                            case 2: System.out.println("🎨 Designer : " + target.getName() + "님, 색상값이 시안이랑 안 맞습니다!"); break;
                        }
                    } else if (target.getClass() == Designer.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 Designer : " + target.getName() + "님, 이건 너무 올드한 감각 아닌가요?"); break;
                            case 1: System.out.println("🎨 Designer : " + target.getName() + "님, 이런 건 레퍼런스 카피 아니에요?"); break;
                            case 2: System.out.println("🎨 Designer : " + target.getName() + "님, 수정 요청 들어왔는데 아직도 반영 안 하셨어요?"); break;
                        }
                    } else if (target.getClass() == FrontendDeveloper.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 Designer : " + target.getName() + "님, 버튼 위치가 1px 어긋났습니다. 다시 맞춰주세요."); break;
                            case 1: System.out.println("🎨 Designer : " + target.getName() + "님, 마진 간격이 시안이랑 달라요!"); break;
                            case 2: System.out.println("🎨 Designer : " + target.getName() + "님, 반응형 깨지는데 왜 확인 안 하셨어요?"); break;
                        }
                    } else if (target.getClass() == BackEndDeveloper.class) {
                        switch (rand.nextInt(3)) {
                            case 0: System.out.println("🎨 Designer : " + target.getName() + "님, 이미지 업로드 너무 느려요. 최적화 해주셔야죠!"); break;
                            case 1: System.out.println("🎨 Designer : " + target.getName() + "님, 썸네일 비율이 시안이랑 다릅니다."); break;
                            case 2: System.out.println("🎨 Designer : " + target.getName() + "님, 정렬 기준이 제가 드린 기획이랑 안 맞아요!"); break;
                        }
                    } else {
                        System.out.println("🎨 Designer : " + target.getName() + "님, 당신 누구세요?");
                    }
                    target.addStress(rand.nextInt(4, 8));
                    System.out.printf("💡 %s의 현재 상태 | 스트레스: %d, 지식: %d\n", target.getName(), target.getStress(), target.getKnowledge());
                }
            }
        }).start();
    }
}
