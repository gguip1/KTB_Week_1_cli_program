package developer;

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
    }
}
