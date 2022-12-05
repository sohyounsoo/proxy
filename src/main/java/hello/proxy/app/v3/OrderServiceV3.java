package hello.proxy.app.v3;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceV3 {

    private final OrderRepositoryV3 orderService;

    public OrderServiceV3(OrderRepositoryV3 orderService) {
        this.orderService = orderService;
    }

    public void orderitem(String itemId) {
        orderService.save(itemId);
    }
}
