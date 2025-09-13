package designer;

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
    }
}
