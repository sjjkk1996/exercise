package ds.com.exercise.repository;

import ds.com.exercise.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

//    @Test
//    public void testInsertMember() {
//        IntStream.rangeClosed(1, 10).forEach(i -> {
//                Member member = Member.builder()
//                        .name("member" + (i<10?"0":"")+i).id("member" + (i<10?"0":"")+i).pass("1234").build();
//                memberRepository.save(member);
//        });
//    }
//    @Test
//    public void testSelectMember(){
//        List<Member> result = memberRepository.findAll();
//        System.out.println("==========================");
//        System.out.println(result);
//        System.out.println("==========================");
//    }
//    @Test
//    public void testUpdateMember(){
//        Member member = Member.builder().mno(3L).name("회원3").id("m03").pass("1111").build();
//        System.out.println(memberRepository.save(member));
//    }
    @Test
    public void testDeleteMember(){
        Long mno = 3L;
        memberRepository.deleteById(mno);
    }
}
