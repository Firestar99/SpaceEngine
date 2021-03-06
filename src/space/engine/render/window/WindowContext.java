package space.engine.render.window;

import space.util.baseobject.Freeable;
import space.util.key.Key;
import space.util.key.attribute.AttributeListCreatorImpl;

@SuppressWarnings("unused")
public interface WindowContext extends Freeable {
	
	//AttributeList
	AttributeListCreatorImpl<WindowContext> CREATOR = new AttributeListCreatorImpl<>();
	Key<ApiType> API_TYPE = CREATOR.generateKey(ApiType.NONE);
	
	//OpenGL / OpenGL ES
	Key<GLProfile> GL_PROFILE = CREATOR.generateKey(GLProfile.PROFILE_ANY);
	Key<Integer> GL_VERSION_MAJOR = CREATOR.generateKey(2);
	Key<Integer> GL_VERSION_MINOR = CREATOR.generateKey(1);
	Key<Boolean> GL_FORWARD_COMPATIBLE = CREATOR.generateKey(Boolean.TRUE);
	
	enum ApiType {
		
		NONE,
		GL,
		GL_ES
		
	}
	
	enum GLProfile {
		
		PROFILE_ANY,
		PROFILE_CORE,
		PROFILE_COMPAT
		
	}
}
