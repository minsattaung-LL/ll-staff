package pro.linuxlab.reservation.business.staff;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pro.linuxlab.reservation.business.BaseBusiness;
import pro.linuxlab.reservation.service.StaffService;

@Component
@RequiredArgsConstructor
public class StaffBusiness extends BaseBusiness implements IStaff {
    final StaffService staffService;
}
