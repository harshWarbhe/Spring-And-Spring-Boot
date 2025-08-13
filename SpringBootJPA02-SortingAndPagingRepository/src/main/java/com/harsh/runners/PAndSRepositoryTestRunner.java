package com.harsh.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;

import com.harsh.entity.Actor;
import com.harsh.service.IActorMgmtService;

public class PAndSRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private IActorMgmtService actorService;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * try {
		 * 
		 * Iterable<Actor> it = actorService.showAllActorBySorting(true, "aname");
		 * Iterable<Actor> it1 = actorService.showAllActorBySorting(true, "aname",
		 * "fee");
		 * 
		 * it.forEach(System.out::println);
		 * System.out.println("----------------------------------------");
		 * it1.forEach(System.out::println);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */

		/*
		 * try { Page<Actor> page=actorService.showActorsByPageNo(1, 5);
		 * page.forEach(System.out::println);
		 * System.out.println("Page no  ::"+(page.getNumber()+1)+"/"+page.getTotalPages(
		 * )); System.out.println(" is the current page first page  ::"+page.isFirst());
		 * System.out.println(" is the current page last page  ::"+page.isLast());
		 * System.out.println(" is the current page has got the next page  ::"+page.
		 * hasNext());
		 * System.out.println(" is the current page has got the previous page  ::"+page.
		 * hasPrevious());
		 * System.out.println(" no.of elements(records) in the current page  ::"+page.
		 * getNumberOfElements()); } catch(Exception e) { e.printStackTrace(); }
		 */

		try {
			Page<Actor> page = actorService.showActorsByPageNoAndSorted(1, 4, true, "aname");
			page.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			actorService.showActorsByPagination(3);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
