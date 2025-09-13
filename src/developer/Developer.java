package developer;

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
    }
}
