package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.inject.Provider;
import org.jboss.demo.widgets.client.local.PickListApp;
import org.jboss.demo.widgets.client.shared.CapitalsListService;
import org.jboss.demo.widgets.client.shared.CapitalsSelected;
import org.jboss.demo.widgets.client.shared.Client;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.framework.Subscription;
import org.jboss.errai.common.client.api.extension.InitVotes;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.CDIEventTypeLookup;
import org.jboss.errai.enterprise.client.cdi.EventProvider;
import org.jboss.errai.enterprise.client.cdi.InstanceProvider;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.Caller;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.builtin.CallerProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.api.builtin.InitBallotProvider;
import org.jboss.errai.ioc.client.api.builtin.MessageBusProvider;
import org.jboss.errai.ioc.client.api.builtin.RequestDispatcherProvider;
import org.jboss.errai.ioc.client.api.builtin.RootPanelProvider;
import org.jboss.errai.ioc.client.api.builtin.SenderProvider;
import org.jboss.errai.ioc.client.container.CreationalCallback;
import org.jboss.errai.ioc.client.container.CreationalContext;
import org.jboss.errai.ioc.client.container.DestructionCallback;
import org.jboss.errai.ioc.client.container.IOCBeanManager;

public class BootstrapperImpl implements Bootstrapper {
  {
    CDIEventTypeLookup.get().addLookup("org.jboss.demo.widgets.client.shared.CapitalsSelected", "java.lang.Object");
    new CDI().initLookupTable(CDIEventTypeLookup.get());
  }
  private final Default _1998831462Default_1407316449 = new Default() {
    public Class annotationType() {
      return Default.class;
    }
  };
  private final Any _1998831462Any_572511553 = new Any() {
    public Class annotationType() {
      return Any.class;
    }
  };
  private final Annotation[] arrayOf_19635043Annotation_1002417864 = new Annotation[] { _1998831462Default_1407316449, _1998831462Any_572511553 };
  private final Client _$309621665Client_0 = new Client() {
    public Class annotationType() {
      return Client.class;
    }
    public String toString() {
      return "@org.jboss.demo.widgets.client.shared.Client()";
    }
  };
  private final Annotation[] arrayOf_19635043Annotation_1735684445 = new Annotation[] { _$309621665Client_0 };
  private final BootstrapperInjectionContext injContext = new BootstrapperInjectionContext();
  private final CreationalContext context = injContext.getRootContext();
  private final CreationalCallback<EventProvider> inj1713_EventProvider_creational = new CreationalCallback<EventProvider>() {
    public EventProvider getInstance(final CreationalContext context) {
      final EventProvider inj1708_EventProvider = new EventProvider();
      context.addBean(context.getBeanReference(EventProvider.class, arrayOf_19635043Annotation_1002417864), inj1708_EventProvider);
      return inj1708_EventProvider;
    }
  };
  private final EventProvider inj1708_EventProvider = inj1713_EventProvider_creational.getInstance(context);
  private final CreationalCallback<MessageBusProvider> inj1714_MessageBusProvider_creational = new CreationalCallback<MessageBusProvider>() {
    public MessageBusProvider getInstance(final CreationalContext context) {
      final MessageBusProvider inj1706_MessageBusProvider = new MessageBusProvider();
      context.addBean(context.getBeanReference(MessageBusProvider.class, arrayOf_19635043Annotation_1002417864), inj1706_MessageBusProvider);
      return inj1706_MessageBusProvider;
    }
  };
  private final MessageBusProvider inj1706_MessageBusProvider = inj1714_MessageBusProvider_creational.getInstance(context);
  private final CreationalCallback<CallerProvider> inj1715_CallerProvider_creational = new CreationalCallback<CallerProvider>() {
    public CallerProvider getInstance(final CreationalContext context) {
      final CallerProvider inj1702_CallerProvider = new CallerProvider();
      context.addBean(context.getBeanReference(CallerProvider.class, arrayOf_19635043Annotation_1002417864), inj1702_CallerProvider);
      return inj1702_CallerProvider;
    }
  };
  private final CallerProvider inj1702_CallerProvider = inj1715_CallerProvider_creational.getInstance(context);
  private final CreationalCallback<RequestDispatcherProvider> inj1716_RequestDispatcherProvider_creational = new CreationalCallback<RequestDispatcherProvider>() {
    public RequestDispatcherProvider getInstance(final CreationalContext context) {
      final RequestDispatcherProvider inj1696_RequestDispatcherProvider = new RequestDispatcherProvider();
      context.addBean(context.getBeanReference(RequestDispatcherProvider.class, arrayOf_19635043Annotation_1002417864), inj1696_RequestDispatcherProvider);
      return inj1696_RequestDispatcherProvider;
    }
  };
  private final RequestDispatcherProvider inj1696_RequestDispatcherProvider = inj1716_RequestDispatcherProvider_creational.getInstance(context);
  private final CreationalCallback<InstanceProvider> inj1717_InstanceProvider_creational = new CreationalCallback<InstanceProvider>() {
    public InstanceProvider getInstance(final CreationalContext context) {
      final InstanceProvider inj1710_InstanceProvider = new InstanceProvider();
      context.addBean(context.getBeanReference(InstanceProvider.class, arrayOf_19635043Annotation_1002417864), inj1710_InstanceProvider);
      return inj1710_InstanceProvider;
    }
  };
  private final InstanceProvider inj1710_InstanceProvider = inj1717_InstanceProvider_creational.getInstance(context);
  private final CreationalCallback<SenderProvider> inj1718_SenderProvider_creational = new CreationalCallback<SenderProvider>() {
    public SenderProvider getInstance(final CreationalContext context) {
      final SenderProvider inj1704_SenderProvider = new SenderProvider();
      context.addBean(context.getBeanReference(SenderProvider.class, arrayOf_19635043Annotation_1002417864), inj1704_SenderProvider);
      return inj1704_SenderProvider;
    }
  };
  private final SenderProvider inj1704_SenderProvider = inj1718_SenderProvider_creational.getInstance(context);
  private final CreationalCallback<IOCBeanManagerProvider> inj1719_IOCBeanManagerProvider_creational = new CreationalCallback<IOCBeanManagerProvider>() {
    public IOCBeanManagerProvider getInstance(final CreationalContext context) {
      final IOCBeanManagerProvider inj1694_IOCBeanManagerProvider = new IOCBeanManagerProvider();
      context.addBean(context.getBeanReference(IOCBeanManagerProvider.class, arrayOf_19635043Annotation_1002417864), inj1694_IOCBeanManagerProvider);
      return inj1694_IOCBeanManagerProvider;
    }
  };
  private final IOCBeanManagerProvider inj1694_IOCBeanManagerProvider = inj1719_IOCBeanManagerProvider_creational.getInstance(context);
  private final CreationalCallback<InitBallotProvider> inj1720_InitBallotProvider_creational = new CreationalCallback<InitBallotProvider>() {
    public InitBallotProvider getInstance(final CreationalContext context) {
      final InitBallotProvider inj1698_InitBallotProvider = new InitBallotProvider();
      context.addBean(context.getBeanReference(InitBallotProvider.class, arrayOf_19635043Annotation_1002417864), inj1698_InitBallotProvider);
      return inj1698_InitBallotProvider;
    }
  };
  private final InitBallotProvider inj1698_InitBallotProvider = inj1720_InitBallotProvider_creational.getInstance(context);
  private final CreationalCallback<DisposerProvider> inj1721_DisposerProvider_creational = new CreationalCallback<DisposerProvider>() {
    public DisposerProvider getInstance(final CreationalContext context) {
      final DisposerProvider inj1712_DisposerProvider = new DisposerProvider();
      context.addBean(context.getBeanReference(DisposerProvider.class, arrayOf_19635043Annotation_1002417864), inj1712_DisposerProvider);
      _$1300398733_beanManager(inj1712_DisposerProvider, inj1694_IOCBeanManagerProvider.get());
      return inj1712_DisposerProvider;
    }
  };
  private final DisposerProvider inj1712_DisposerProvider = inj1721_DisposerProvider_creational.getInstance(context);
  private final CreationalCallback<RootPanelProvider> inj1722_RootPanelProvider_creational = new CreationalCallback<RootPanelProvider>() {
    public RootPanelProvider getInstance(final CreationalContext context) {
      final RootPanelProvider inj1700_RootPanelProvider = new RootPanelProvider();
      context.addBean(context.getBeanReference(RootPanelProvider.class, arrayOf_19635043Annotation_1002417864), inj1700_RootPanelProvider);
      return inj1700_RootPanelProvider;
    }
  };
  private final RootPanelProvider inj1700_RootPanelProvider = inj1722_RootPanelProvider_creational.getInstance(context);
  private final CreationalCallback<PickListApp> inj1724_PickListApp_creational = new CreationalCallback<PickListApp>() {
    public PickListApp getInstance(final CreationalContext context) {
      final PickListApp inj1723_PickListApp = new PickListApp();
      context.addBean(context.getBeanReference(PickListApp.class, arrayOf_19635043Annotation_1002417864), inj1723_PickListApp);
      _949926629_event(inj1723_PickListApp, inj1708_EventProvider.provide(new Class[] { CapitalsSelected.class }, arrayOf_19635043Annotation_1735684445));
      _949926629_rpcCaller(inj1723_PickListApp, inj1702_CallerProvider.provide(new Class[] { CapitalsListService.class }, null));
      InitVotes.registerOneTimeInitCallback(new Runnable() {
        public void run() {
          inj1723_PickListApp.remoteCall();
        }
      });
      final Subscription var1 = CDI.subscribe("org.jboss.demo.widgets.client.shared.CapitalsSelected", new AbstractCDIEventCallback<CapitalsSelected>() {
        {
          qualifierSet.add("org.jboss.demo.widgets.client.shared.Server");
        }
        public void fireEvent(final CapitalsSelected event) {
          inj1723_PickListApp.capitalsSelected(event);
        }
        public String toString() {
          return "Observer: org.jboss.demo.widgets.client.shared.CapitalsSelected [@org.jboss.demo.widgets.client.shared.Server()]";
        }
      });
      final Subscription var2 = ErraiBus.get().subscribe("cdi.event:org.jboss.demo.widgets.client.shared.CapitalsSelected", CDI.ROUTING_CALLBACK);
      context.addDestructionCallback(inj1723_PickListApp, new DestructionCallback<PickListApp>() {
        public void destroy(final PickListApp obj) {
          var1.remove();
          var2.remove();
        }
      });
      return inj1723_PickListApp;
    }
  };
  private final PickListApp inj1723_PickListApp = inj1724_PickListApp_creational.getInstance(context);
  private void declareBeans_0() {
    injContext.addBean(EventProvider.class, EventProvider.class, inj1713_EventProvider_creational, inj1708_EventProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(ContextualTypeProvider.class, EventProvider.class, inj1713_EventProvider_creational, inj1708_EventProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(MessageBusProvider.class, MessageBusProvider.class, inj1714_MessageBusProvider_creational, inj1706_MessageBusProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(Provider.class, MessageBusProvider.class, inj1714_MessageBusProvider_creational, inj1706_MessageBusProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(CallerProvider.class, CallerProvider.class, inj1715_CallerProvider_creational, inj1702_CallerProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(ContextualTypeProvider.class, CallerProvider.class, inj1715_CallerProvider_creational, inj1702_CallerProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(RequestDispatcherProvider.class, RequestDispatcherProvider.class, inj1716_RequestDispatcherProvider_creational, inj1696_RequestDispatcherProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(Provider.class, RequestDispatcherProvider.class, inj1716_RequestDispatcherProvider_creational, inj1696_RequestDispatcherProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(InstanceProvider.class, InstanceProvider.class, inj1717_InstanceProvider_creational, inj1710_InstanceProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(ContextualTypeProvider.class, InstanceProvider.class, inj1717_InstanceProvider_creational, inj1710_InstanceProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(SenderProvider.class, SenderProvider.class, inj1718_SenderProvider_creational, inj1704_SenderProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(ContextualTypeProvider.class, SenderProvider.class, inj1718_SenderProvider_creational, inj1704_SenderProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(IOCBeanManagerProvider.class, IOCBeanManagerProvider.class, inj1719_IOCBeanManagerProvider_creational, inj1694_IOCBeanManagerProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(Provider.class, IOCBeanManagerProvider.class, inj1719_IOCBeanManagerProvider_creational, inj1694_IOCBeanManagerProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(InitBallotProvider.class, InitBallotProvider.class, inj1720_InitBallotProvider_creational, inj1698_InitBallotProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(ContextualTypeProvider.class, InitBallotProvider.class, inj1720_InitBallotProvider_creational, inj1698_InitBallotProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(DisposerProvider.class, DisposerProvider.class, inj1721_DisposerProvider_creational, inj1712_DisposerProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(ContextualTypeProvider.class, DisposerProvider.class, inj1721_DisposerProvider_creational, inj1712_DisposerProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(RootPanelProvider.class, RootPanelProvider.class, inj1722_RootPanelProvider_creational, inj1700_RootPanelProvider, arrayOf_19635043Annotation_1002417864, null, true);
    injContext.addBean(Provider.class, RootPanelProvider.class, inj1722_RootPanelProvider_creational, inj1700_RootPanelProvider, arrayOf_19635043Annotation_1002417864, null, false);
    injContext.addBean(PickListApp.class, PickListApp.class, inj1724_PickListApp_creational, inj1723_PickListApp, arrayOf_19635043Annotation_1002417864, null, true);
  }

  private native static void _949926629_event(PickListApp instance, Event value) /*-{
    instance.@org.jboss.demo.widgets.client.local.PickListApp::event = value;
  }-*/;

  private native static void _949926629_rpcCaller(PickListApp instance, Caller value) /*-{
    instance.@org.jboss.demo.widgets.client.local.PickListApp::rpcCaller = value;
  }-*/;

  private native static void _$1300398733_beanManager(DisposerProvider instance, IOCBeanManager value) /*-{
    instance.@org.jboss.errai.ioc.client.api.builtin.DisposerProvider::beanManager = value;
  }-*/;

  // The main IOC bootstrap method.
  public BootstrapperInjectionContext bootstrapContainer() {
    declareBeans_0();
    return injContext;
  }
}