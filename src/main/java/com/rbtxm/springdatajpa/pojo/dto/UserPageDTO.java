package com.rbtxm.springdatajpa.pojo.dto;

import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
public class UserPageDTO implements Pageable {
    private Long id;
    private String name;
    private String email;


    /**
     * Returns the page to be returned.
     *
     * @return the page to be returned or throws {@link UnsupportedOperationException} if the object is
     * {@link #isUnpaged()}.
     * @throws UnsupportedOperationException if the object is {@link #isUnpaged()}.
     */
    @Override
    public int getPageNumber() {
        return 0;
    }

    /**
     * Returns the number of items to be returned.
     *
     * @return the number of items of that page or throws {@link UnsupportedOperationException} if the object is
     * {@link #isUnpaged()}.
     * @throws UnsupportedOperationException if the object is {@link #isUnpaged()}.
     */
    @Override
    public int getPageSize() {
        return 0;
    }

    /**
     * Returns the offset to be taken according to the underlying page and page size.
     *
     * @return the offset to be taken or throws {@link UnsupportedOperationException} if the object is
     * {@link #isUnpaged()}.
     * @throws UnsupportedOperationException if the object is {@link #isUnpaged()}.
     */
    @Override
    public long getOffset() {
        return 0;
    }

    /**
     * Returns the sorting parameters.
     *
     * @return
     */
    @Override
    public Sort getSort() {
        return null;
    }

    /**
     * Returns the {@link Pageable} requesting the next {@link Page}.
     *
     * @return
     */
    @Override
    public Pageable next() {
        return null;
    }

    /**
     * Returns the previous {@link Pageable} or the first {@link Pageable} if the current one already is the first one.
     *
     * @return
     */
    @Override
    public Pageable previousOrFirst() {
        return null;
    }

    /**
     * Returns the {@link Pageable} requesting the first page.
     *
     * @return
     */
    @Override
    public Pageable first() {
        return null;
    }

    /**
     * Creates a new {@link Pageable} with {@code pageNumber} applied.
     *
     * @param pageNumber
     * @return a new {@link PageRequest} or throws {@link UnsupportedOperationException} if the object is
     * {@link #isUnpaged()} and the {@code pageNumber} is not zero.
     * @throws UnsupportedOperationException if the object is {@link #isUnpaged()}.
     * @since 2.5
     */
    @Override
    public Pageable withPage(int pageNumber) {
        return null;
    }

    /**
     * Returns whether there's a previous {@link Pageable} we can access from the current one. Will return
     * {@literal false} in case the current {@link Pageable} already refers to the first page.
     *
     * @return
     */
    @Override
    public boolean hasPrevious() {
        return false;
    }
}
