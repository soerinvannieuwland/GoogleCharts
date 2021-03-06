// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package emailtemplate.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class CopyAttachmentContent extends CustomJavaAction<Boolean>
{
	private IMendixObject __CopyFrom;
	private system.proxies.FileDocument CopyFrom;
	private IMendixObject __CopyTo;
	private system.proxies.FileDocument CopyTo;

	public CopyAttachmentContent(IContext context, IMendixObject CopyFrom, IMendixObject CopyTo)
	{
		super(context);
		this.__CopyFrom = CopyFrom;
		this.__CopyTo = CopyTo;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.CopyFrom = __CopyFrom == null ? null : system.proxies.FileDocument.initialize(getContext(), __CopyFrom);

		this.CopyTo = __CopyTo == null ? null : system.proxies.FileDocument.initialize(getContext(), __CopyTo);

		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "CopyAttachmentContent";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
