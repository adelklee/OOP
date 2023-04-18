
/**
 * 여기에 Test 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Test
{

    /**
     * Test 클래스의 객체 생성자
     */
    public Test()
    {
    }

    public void compareStrings()
    {
        //String s1 = "Hello"; // String literal
        //String s2 = "Hello"; // String literal
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // test for identity
        if(s1 == s2){ 
            System.out.println("Same identity(object)!");
        }
        else{
            System.out.println("Different identities(object)!");
        }
        // test for equality
        if(s1.equals(s2)){ 
            System.out.println("Same contents(equal)!");
        }
        else{
            System.out.println("Different contents(not equel)!");
        }
    }
}
