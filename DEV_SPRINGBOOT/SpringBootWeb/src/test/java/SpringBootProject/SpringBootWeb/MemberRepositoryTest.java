package SpringBootProject.SpringBootWeb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
class MemberRepositoryTest {


	@Autowired MemberRepository memberRepository;
	
	@Test
	@Transactional // org.springframework.transaction.annotation.Transactional 사용하기 바람
	@Rollback(false)
	public void testMember() throws Exception{
		//given	
		Member member = new Member();
		member.setUsername("김찬호");			
		
		// when
		Long saveId = memberRepository.save(member);
		Member finMember = memberRepository.find(saveId);
		
		// then : Assertions는 org.assertj.core.api 패키지로 선택해야 함. org.junit.jupiter.api 패키지 아님
		Assertions.assertThat(finMember.getId()).isEqualTo(member.getId());
		Assertions.assertThat(finMember.getUsername()).isEqualTo(member.getUsername());
		
	}

}
