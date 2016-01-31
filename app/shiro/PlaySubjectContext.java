package shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.subject.SubjectContext;
import org.apache.shiro.subject.support.DefaultSubjectContext;

public class PlaySubjectContext extends DefaultSubjectContext {

	private static final long serialVersionUID = 1L;
	
	
	
	
	public PlaySubjectContext() {
		super();
	}



	public PlaySubjectContext(SubjectContext ctx) {
		super(ctx);
	}



	@Override
	public Session getSession() {
		return super.getSession();
	}
	
	
	
	@Override
	public boolean isSessionCreationEnabled() {
		return super.isSessionCreationEnabled();
	}

}
