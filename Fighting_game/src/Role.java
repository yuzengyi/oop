import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces = {"��������", "��������" , "��òӢ��","��ٶ���", "��òƽƽ","һ����Ϳ" , "��Ŀ����"};
    String[] girlfaces = {"��ۼ����", "��������","��������","��Ľ���" , "��òƽƽ", "��ò��ª" , "�Ҳ��̶�"};

    String[] attacks_desc = {
        "%sʹ����һ�С����Ķ�����ת���Է������һ����%s���ĵ���̨Ѩ��ȥ��",
        "%sʹ����һ�С��ο�̽צ�������������԰���б���Ϊץ����%s��",
        "%s���һ���������·���һ�С�����׹�ء�������%s˫�ȡ�",
        "%s�������ƣ�һ˲�����ı��Ѫ�죬һʽ�������ס�������%s��",
        "%s���ַ������ָ�����һ�С�û�����������ʵʵ�Ĵ���%s��",
        "%s�ϲ������������У�һ�С���������������������%s��"
    };
    String[] injured_desc = {
        "���%s���˰벽����������",
        "�����%s���һ������","���һ�����У�%sʹ��������","���%sʹ����ƺ���һ������Ȼ���˵�����",
        "���%sҡҡ�λΣ�һ��ˤ���ڵ�","���%s��ɫһ�±�òҰף������˺ü���",
        "������䡻��һ����%s������Ѫ�������",
        "���%sһ���ҽУ���̲�����������ȥ"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if(gender =='��'){
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender =='Ů'){
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else{
            this.face = "���в�Ů";
        }
    }

    // define a fight measure
    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];
        System.out.printf(KungFu,this.getName(),role.getName());
        System.out.println();
        int hurt = r.nextInt(20)+1;     

        int remainBoold = role.getBlood()-hurt;
        remainBoold = remainBoold<0?0:remainBoold;
        role.setBlood(remainBoold);
        //���˵�����
        if (remainBoold>90) {
            System.out.printf(injured_desc[0],role.getName());
        } else if (remainBoold>80) {
            System.out.printf(injured_desc[1],role.getName());
        } else if (remainBoold>70) {
            System.out.printf(injured_desc[2],role.getName());
        } else if (remainBoold>60) {
            System.out.printf(injured_desc[3],role.getName());
        } else if (remainBoold>40) {
            System.out.printf(injured_desc[4],role.getName());
        } else if (remainBoold>20) {
            System.out.printf(injured_desc[5],role.getName());
        } else if (remainBoold>10) {
            System.out.printf(injured_desc[6],role.getName());
        } else {
            System.out.printf(injured_desc[7],role.getName());
        }
        System.out.println();
    }
    public void showRoleInfo(){
        System.out.println("����Ϊ"+getName());
        System.out.println("Ѫ��Ϊ"+getBlood());
        System.out.println("�Ա�Ϊ"+getGender());
        System.out.println("����Ϊ"+getFace());
    }
}
