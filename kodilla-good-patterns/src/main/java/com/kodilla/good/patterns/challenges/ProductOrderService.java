package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private OrderSpecyfication orderSpecyfication;
    private OrderInformationService orderInformationService;
    private OrderRepository orderRepository;

    public ProductOrderService(final OrderSpecyfication orderSpecyfication, final OrderInformationService orderInformationService, final OrderRepository orderRepository) {
        this.orderSpecyfication = orderSpecyfication;
        this.orderInformationService = orderInformationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final Order order) {
        boolean orderComplieted = orderSpecyfication.createSpecyfikation(order);
        if(orderComplieted){
            orderInformationService.inform(order.getBuyer(),order.getSeller());
            orderRepository.createOrderRepo(order);
            return new OrderDto(order.getSeller(),order.getBuyer(),true);
        } else {
            return new OrderDto(order.getBuyer(),order.getSeller(), false);
        }
    }

}
