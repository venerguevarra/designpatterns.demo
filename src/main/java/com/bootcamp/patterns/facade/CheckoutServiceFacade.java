package com.bootcamp.patterns.facade;

public class CheckoutServiceFacade implements CheckService {
    private OrderService orderService;
    private PaymentService paymentService;
    private VoucherService voucherService;
    private ShippingService shippingService;

    public CheckoutServiceFacade(OrderService orderService,
                                 PaymentService paymentService,
                                 VoucherService voucherService,
                                 ShippingService shippingService) {
        this.orderService = orderService;
        this.paymentService = paymentService;
        this.voucherService = voucherService;
        this.shippingService = shippingService;
    }

    @Override
    public void checkout() {
        orderService.calculate();
        paymentService.processPayment();
        shippingService.createShippingLabels();
    }

    @Override
    public void checkoutWithVoucher() {
        orderService.calculate();
        paymentService.processPayment();
        voucherService.applyDiscount();
        shippingService.createShippingLabels();
    }

}
