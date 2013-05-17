package jp.co.cyberagent.android.gpuimage;


public class GPUImageTwoPassFilter extends GPUImageFilterGroup 
{
	public GPUImageTwoPassFilter(String firstVertexShader,String firstFragmentShader,String secondVertexShader,String secondFragmentShader) 
	{
		super(null);
		mFilters.add(new GPUImageFilter(firstVertexShader,firstFragmentShader));
		mFilters.add(new GPUImageFilter(secondVertexShader,secondFragmentShader));
	}
}
