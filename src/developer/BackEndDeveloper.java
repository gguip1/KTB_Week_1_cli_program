package developer;

import designer.Designer;
import worker.Worker;

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
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void ask(Worker target) {
        new Thread(() -> {
            while (true) {
                try {
                    int delay = rand.nextInt(12, 58) * 1000;
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("=========================================");
                if (target.getStress() >= 80) {
                    System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님이 잠시 쉬는게 좋을 것 같습니다. 너무 힘들어 보여요.");
                } else {
                    if (target.getClass() == Worker.class) {
                        switch (rand.nextInt(3)) {
                            case 0:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 서버실은 만지지 마세요. 전원 또 꺼뜨리실까봐요.");
                                break;
                            case 1:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 로그라도 확인해보셨어요?");
                                break;
                            case 2:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 데이터는 아무 데나 저장하는 게 아닙니다.");
                                break;
                        }
                    } else if (target.getClass() == Developer.class) {
                        switch (rand.nextInt(3)) {
                            case 0:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 서버 자원 고려 안 하고 코드 짜신 거죠?");
                                break;
                            case 1:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 캐시 처리도 안 하고 배포하셨나요?");
                                break;
                            case 2:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 병목 로그가 잔뜩 찍히는데 확인 안 하셨죠?");
                                break;
                        }
                    } else if (target.getClass() == Designer.class) {
                        switch (rand.nextInt(3)) {
                            case 0:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, GIF는 용량이 너무 커서 서버가 터집니다.");
                                break;
                            case 1:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 원본 PSD를 바로 올리시면 서버가 힘들어요.");
                                break;
                            case 2:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 해상도 8K는 좀 과한 거 아닌가요?");
                                break;
                        }
                    } else if (target.getClass() == FrontendDeveloper.class) {
                        switch (rand.nextInt(3)) {
                            case 0:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, API 호출을 왜 1초에 10번씩 하시나요?");
                                break;
                            case 1:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 요청에 불필요한 파라미터가 너무 많습니다.");
                                break;
                            case 2:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 응답 캐싱 안 쓰고 매번 서버 두드리면 느릴 수밖에요.");
                                break;
                        }
                    } else if (target.getClass() == BackEndDeveloper.class) {
                        switch (rand.nextInt(3)) {
                            case 0:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 쿼리 최적화 안 하셨죠?");
                                break;
                            case 1:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 배치 작업 로그가 계속 실패 뜹니다.");
                                break;
                            case 2:
                                System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 트랜잭션 락 걸려서 서비스 멈춘 거 아세요?");
                                break;
                        }
                    } else {
                        System.out.println("🗄️ BackendDeveloper : " + target.getName() + "님, 당신 누구세요?");
                    }
                    target.addStress(rand.nextInt(4, 8));
                    System.out.printf("💡 %s의 현재 상태 | 스트레스: %d, 지식: %d\n", target.getName(), target.getStress(), target.getKnowledge());
                }
            }
        }).start();
    }
}
