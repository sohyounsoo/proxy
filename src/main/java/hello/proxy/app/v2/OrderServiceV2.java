package hello.proxy.app.v2;

public class OrderServiceV2 {

    private final OrderRepositoryV2 orderService;

    public OrderServiceV2(OrderRepositoryV2 orderService) {
        this.orderService = orderService;
    }

    public void orderitem(String itemId) {
        orderService.save(itemId);
    }
}
