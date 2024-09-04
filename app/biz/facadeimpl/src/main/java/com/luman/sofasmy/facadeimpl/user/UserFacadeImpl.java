package com.luman.sofasmy.facadeimpl.user;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.luman.sofasmy.facade.user.UserFacade;

@SofaService(bindings = {@SofaServiceBinding(bindingType = "bolt")})
public class UserFacadeImpl implements UserFacade {
}
