/**
 * Author: markliu
 * Time  : 16-9-4 下午3:24
 */
public abstract class Component {

	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void hasChanged() {
		mediator.componentChanged(this);
	}

	public abstract void update(Component component);
}
