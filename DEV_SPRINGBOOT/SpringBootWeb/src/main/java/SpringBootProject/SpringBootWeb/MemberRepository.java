package SpringBootProject.SpringBootWeb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository // 이걸 저장소로 쓰겠다는뜻
public class MemberRepository {//DAO랑 비슷한 파일임

		@PersistenceContext
		private EntityManager em;
		
		public Long save(Member member) {
			em.persist(member);
			return member.getId();
		}
		
		public Member find(Long id) {
			return em.find(Member.class, id);
		}
		
}
