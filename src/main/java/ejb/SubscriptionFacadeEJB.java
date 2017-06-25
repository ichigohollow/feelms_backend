package ejb;

import facade.AbstractFacade;
import facade.SubscriptionFacade;
import model.Subscription;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Arturo on 24-06-2017.
 */

@Stateless
public class SubscriptionFacadeEJB extends AbstractFacade<Subscription> implements SubscriptionFacade{

    @PersistenceContext(unitName="feelmsPU")
    private EntityManager em;

    public SubscriptionFacadeEJB() {
        super(Subscription.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }

}
