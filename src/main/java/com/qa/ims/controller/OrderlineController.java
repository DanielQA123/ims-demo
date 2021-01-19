	package com.qa.ims.controller;

	import java.util.ArrayList;
	import java.util.List;

	import org.apache.log4j.Logger;

	import com.qa.ims.persistence.domain.Order;
	import com.qa.ims.persistence.domain.Orderline;
	import com.qa.ims.services.CrudServices;
import com.qa.ims.services.OrderServices;
import com.qa.ims.utils.Utils;

	public class OrderlineController implements CrudController<Orderline> {
		
		public static final Logger LOGGER = Logger.getLogger(OrderlineController.class);

		private CrudServices<Orderline> orderlineService;
		
		public OrderlineController(CrudServices<Orderline> orderlineService) {
			this.orderlineService = orderlineService;
		}
		
		Long getLongInput() {
			return Utils.getLongInput();
		}
		
		@Override
		public List<Orderline> readAll() {
			List<Orderline> orderlines = orderlineService.readAll();
			for (Orderline orderline : orderlines) {
				LOGGER.info(orderline.toString());
			}
			return orderlines;
		}

		@Override
		public Orderline create() {
				List<Orderline> item = new ArrayList<>();
				LOGGER.info("Please enter the customer id");
				Long customerId = getLongInput();
				Orderline orderline = new Orderline(customerId);
				item.add(orderline);
				LOGGER.info("Please enter the item id please");
				Long itemId = getLongInput();
				boolean addOrderline = true;
				while(addOrderline) {
					LOGGER.info("Please enter the order id");
					Long orderId = getLongInput();
					orderline = orderlineService.create(new Orderline(customerId, itemId, orderId));
					item.add(orderline);
					LOGGER.info("Orderline Created");
				}
			return orderline;
		}

		@Override
		public Orderline update() {
			List<Orderline> item2 = new ArrayList<>();
			LOGGER.info("Please enter the orderline id you would like to update ");
			Long orderlineId = Long.valueOf(getLongInput());
			LOGGER.info("Please enter the customer id");
			Long customerId = Long.valueOf(getLongInput());
			Orderline orderline = new Orderline(orderlineId, customerId);
			item2.remove(orderline);
			LOGGER.info("Do you want add to an order");
			String addOrder = "yes"; 
			
			if (addOrder == "yes" ) {
			while(addOrder == "yes") {
				LOGGER.info("Add the item id");
				Long itemId = getLongInput();
				LOGGER.info("Add the order id");
				Long orderId = getLongInput();
				LOGGER.info("Please enter the orderline id you would like to update ");
				Long orderlineId = Long.valueOf(getLongInput());
				LOGGER.info("Please enter the customer id");
				Long customerId = Long.valueOf(getLongInput());
				Orderline orderline = orderlineService.update(new Orderline(orderlineId, customerId, itemId, orderId));
				item2.add(orderline);
				LOGGER.info("Orderline Updated");
			}
			return orderline;
			}
		}

		@Override
		public void delete() {
			LOGGER.info("Please enter the orderline id you would like to delete");
			Long orderlineId = Long.valueOf(getLongInput()); 
			LOGGER.info("Please enter the order id");
			Long orderId = Long.valueOf(getLongInput());
			LOGGER.info("Please enter the item id ");
			Long itemId = Long.valueOf(getLongInput());
			LOGGER.info("Finally please enter the customer id to finalise the deletion");
			Long customerId = Long.valueOf(getLongInput());		
			orderlineService.delete(orderlineId);
			orderlineService.delete(orderId);
			orderlineService.delete(itemId);
			orderlineService.delete(customerId);	
		}

	}

	
	

