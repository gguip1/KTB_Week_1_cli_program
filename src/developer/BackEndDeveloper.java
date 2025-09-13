package developer;

public class BackEndDeveloper extends Developer{

    public BackEndDeveloper(String name, String programmingLanguage) {
        super(name, programmingLanguage);
    }

    @Override
    public void pray() {
        System.out.println("=========================================");
        System.out.println("🙏 "+ name +"은(는) 오늘도 서버가 터지지 않기를 기도합니다. 🙏");
    }

    @Override
    public void work() {
        System.out.println("=========================================");

        switch (rand.nextInt(5)) {
            case 0:
                System.out.println("💾 데이터베이스 쿼리를 최적화했습니다.");
                System.out.println("🔍 대용량 데이터를 빠르게 다루는 방법을 익혔습니다.");
                System.out.println("😵 복잡한 인덱스 튜닝에 시간이 많이 걸렸습니다.");
                System.out.println("📊 [스트레스: 중간~높음 | 성취: 보통~높음]");
                addStress(rand.nextInt(4, 9));
                addKnowledge(rand.nextInt(3, 7));
                break;

            case 1:
                System.out.println("🔐 인증 로직을 개선해 보안을 강화했습니다.");
                System.out.println("🛡️ 안전한 서비스 운영의 중요성을 다시 느꼍습니다.");
                System.out.println("😓 예외 처리 과정에서 버그가 많이 나와 힘들었습니다.");
                System.out.println("📊 [스트레스: 높음 | 성취: 보통]");
                addStress(rand.nextInt(5, 10));
                addKnowledge(rand.nextInt(3, 6));
                break;

            case 2:
                System.out.println("☁️ 서버를 배포하고 클라우드 환경을 구성했습니다.");
                System.out.println("🚀 확장성을 고려한 설정으로 성취감을 느꼍습니다.");
                System.out.println("🤯 네트워크 설정 오류로 시간을 허비했습니다.");
                System.out.println("📊 [스트레스: 높음 | 성취: 높음]");
                addStress(rand.nextInt(5, 10));
                addKnowledge(rand.nextInt(4, 8));
                break;

            case 3:
                System.out.println("📊 서버 로그를 분석해 병목 현상을 해결했습니다.");
                System.out.println("⚙️ 문제 해결 능력이 한층 성장했습니다.");
                System.out.println("😤 원인을 찾는 과정이 길어져 피곤했습니다.");
                System.out.println("📊 [스트레스: 중간~높음 | 성취: 보통]");
                addStress(rand.nextInt(4, 8));
                addKnowledge(rand.nextInt(3, 6));
                break;

            case 4:
                System.out.println("📝 REST API 문서를 작성했습니다.");
                System.out.println("📚 명확한 문서가 협업에 큰 도움이 되었습니다.");
                System.out.println("😮‍💨 문서화 과정이 생각보다 시간이 많이 걸렸습니다.");
                System.out.println("📊 [스트레스: 낮음~중간 | 성취: 보통]");
                addStress(rand.nextInt(2, 5));
                addKnowledge(rand.nextInt(3, 6));
                break;
        }
    }
}
