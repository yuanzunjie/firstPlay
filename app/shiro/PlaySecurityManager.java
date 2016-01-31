package shiro;

import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SubjectFactory;
import org.apache.shiro.subject.SubjectContext;

public class PlaySecurityManager extends DefaultSecurityManager {
	
	
	@Override
	public void setSubjectFactory(SubjectFactory subjectFactory) {
		super.setSubjectFactory(new PlaySubjectFactory());
	}

	
	
	protected PlaySubjectContext createSubjectContext = new PlaySubjectContext();
	
	
	@Override
	protected SubjectContext copy(SubjectContext subjectContext) {
			if (subjectContext instanceof PlaySubjectContext) {
				 return new PlaySubjectContext(subjectContext);
			}
		return super.copy(subjectContext);
	}

}
