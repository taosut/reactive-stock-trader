package com.redelastic.stocktrader.broker.impl.order;

import akka.Done;
import com.redelastic.stocktrader.PortfolioId;
import com.redelastic.stocktrader.broker.api.OrderStatus;
import com.redelastic.stocktrader.order.OrderDetails;

import java.util.Optional;
import java.util.concurrent.CompletionStage;

public interface OrderModel {
    CompletionStage<Optional<OrderStatus>> getStatus();

    CompletionStage<Done> placeOrder(PortfolioId portfolioId, OrderDetails orderDetails);
}
