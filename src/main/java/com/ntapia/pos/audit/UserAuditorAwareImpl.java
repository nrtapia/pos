package com.ntapia.pos.audit;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
public class UserAuditorAwareImpl implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {

    //String userName = SecurityContextHolder.getContext().getAuthentication().getName();
    String userName = "dev";
    return Optional.of(userName);
  }

}