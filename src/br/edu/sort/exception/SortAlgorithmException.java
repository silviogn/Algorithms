package br.edu.sort.exception;


public class SortAlgorithmException extends Exception {

	private static final long serialVersionUID = 328716956025277840L;

	private SortAlgorithmErrorCode errorCode;

	public SortAlgorithmException(SortAlgorithmErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public SortAlgorithmException(SortAlgorithmErrorCode errorCode, String arg0, Throwable arg1) {
		super(arg0, arg1);
		this.setErrorCode(errorCode);
	}

	public SortAlgorithmException(SortAlgorithmErrorCode heapSortErrorCode, String arg0) {
		super(arg0);
		this.setErrorCode(heapSortErrorCode);
	}

	public SortAlgorithmException(SortAlgorithmErrorCode heapSortErrorCode, Throwable arg0) {
		super(arg0);
		this.setErrorCode(errorCode);
	}

	public SortAlgorithmErrorCode getErrorCode() {
		return errorCode;
	}

	private void setErrorCode(SortAlgorithmErrorCode errorCode) {
		this.errorCode = errorCode;
	}
}
