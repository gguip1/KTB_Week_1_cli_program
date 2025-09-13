package worker;

import java.util.Random;

public class Worker {
    protected Random rand = new Random();
    protected String name;
    protected int stress;
    protected int knowledge;

    public Worker(String name){
        this.name = name;
    }

    public void work(){
        System.out.println("=========================================");

        switch (rand.nextInt(5)) {
            case 0:
                System.out.println("🔨 오늘은 현장에서 묵묵히 일을 했습니다.");
                System.out.println("💪 체력은 줄었지만 작은 성취를 느꼍습니다.");
                System.out.println("😵 반복적인 노동이 스트레스의 원인입니다.");
                System.out.println("📊 [스트레스: 중간~높음 | 성취: 낮음]");
                addStress(rand.nextInt(4, 9));
                addKnowledge(rand.nextInt(1, 3));
                break;

            case 1:
                System.out.println("📦 무거운 짐을 옮기며 하루를 보냈습니다.");
                System.out.println("🧠 간단한 요령을 배우며 조금은 효율적이 되었습니다.");
                System.out.println("😓 체력 소모가 크고 피곤함이 큽니다.");
                System.out.println("📊 [스트레스: 높음 | 성취: 낮음]");
                addStress(rand.nextInt(6, 12));
                addKnowledge(rand.nextInt(1, 2));
                break;

            case 2:
                System.out.println("🧹 주변을 정리하고 환경을 개선했습니다.");
                System.out.println("🙂 깨끗해진 공간이 마음을 조금 편하게 합니다.");
                System.out.println("😮‍💨 단순 반복이 지루하게 다가옵니다.");
                System.out.println("📊 [스트레스: 낮음~중간 | 성취: 낮음]");
                addStress(rand.nextInt(2, 5));
                addKnowledge(rand.nextInt(1, 2));
                break;

            case 3:
                System.out.println("👷 동료들과 함께 협력하여 큰 작업을 마무리했습니다.");
                System.out.println("🤝 협업에서 배우는 점이 있습니다.");
                System.out.println("😤 하지만 의견 충돌로 스트레스가 쌓였습니다.");
                System.out.println("📊 [스트레스: 중간~높음 | 성취: 보통]");
                addStress(rand.nextInt(4, 8));
                addKnowledge(rand.nextInt(2, 4));
                break;

            case 4:
                System.out.println("📚 새로운 작업 방식을 배워 조금 더 효율적으로 일했습니다.");
                System.out.println("💡 단순한 일에도 배움은 있습니다.");
                System.out.println("😵 피로 누적으로 힘이 듭니다.");
                System.out.println("📊 [스트레스: 중간 | 성취: 보통]");
                addStress(rand.nextInt(3, 6));
                addKnowledge(rand.nextInt(2, 5));
                break;
        }
    }

    public void vacation() {
        System.out.println("=========================================");

        switch(rand.nextInt(5)){
            case 0:
                System.out.println("🌴 휴가를 다녀오니 머리가 맑아지고 스트레스가 줄어든 것 같습니다.");
                System.out.println("😌 충분한 휴식으로 재충전했지만, 업무 감각이 살짝 무뎌졌네요.");
                System.out.println("📝 휴가 전의 업무 일정이 잘 기억나지 않습니다.");
                System.out.println("📊 [스트레스: 크게 감소 | 성취: 소폭 감소]");
                addStress(-10);
                addKnowledge(-3);
                break;

            case 1:
                System.out.println("🏖️ 휴가를 떠나려 했습니다.");
                System.out.println("✈️ 하지만 갑작스러운 항공편 취소로 여행이 무산되었습니다...");
                System.out.println("😫 기대가 컸던 만큼 스트레스가 크게 늘어났습니다.");
                System.out.println("📊 [스트레스: 높음 | 성취: 없음]");
                addStress(rand.nextInt(6, 12));   // 기대가 깨져 스트레스 상승
                addKnowledge(0);                 // 배움/성취 없음
                break;

            case 2:
                System.out.println("🏕️ 자연 속에서의 휴식이 마음을 편안하게 해주었습니다.");
                System.out.println("🔥 캠프파이어를 하며 스트레스를 잊었지만, 돌아오니 약간의 피곤함이 남아있습니다.");
                System.out.println("🗒️ 휴가 전에 했던 일이 잘 기억나지 않습니다.");
                System.out.println("📊 [스트레스: 크게 감소 | 성취: 소폭 감소]");
                addStress(-9);
                addKnowledge(-2);
                break;

            case 3:
                System.out.println("🛌 충분한 수면과 휴식이 스트레스를 크게 줄여주었습니다.");
                System.out.println("😴 몸과 마음이 모두 재충전되었지만, 업무 감각은 조금 무뎌졌습니다.");
                System.out.println("🗂️ 휴가 전에 어떤 일을 했는지 기억이 흐릿합니다.");
                System.out.println("📊 [스트레스: 크게 감소 | 성취: 소폭 감소]");
                addStress(-11);
                addKnowledge(-3);
                break;

            case 4:
                System.out.println("🎨 취미 활동을 하며 스트레스를 해소하고 마음의 평화를 찾았습니다.");
                System.out.println("🖌️ 창의적인 활동이 에너지를 충전시켜주었지만, 일상으로 돌아오니 약간 피곤합니다.");
                System.out.println("📋 휴가 전에 진행했던 프로젝트가 잘 떠오르지 않습니다.");
                System.out.println("📊 [스트레스: 중간 감소 | 성취: 소폭 감소]");
                addStress(-7);
                addKnowledge(-2);
                break;
        }
    }

    public String getName(){
        return name;
    }

    public int getStress(){
        return stress;
    }

    public int getKnowledge(){
        return knowledge;
    }

    public void addStress(int value){
        if (stress + value < 0) {
            stress = 0;
        } else {
            stress += value;
        }
    }

    public void addKnowledge(int value){
        knowledge += value;
    }
}
