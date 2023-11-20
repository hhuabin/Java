import { lazy } from "react";

const Home = lazy(() => import("@/pages/Home/Home"))

// import Home from "../pages/Home/Home";

export type RouteRecordRaw = {
	path: string;
	element: JSX.Element;
	name?: string | symbol;
	redirect?: string;
	// alias?: string | string[];
	children?: RouteRecordRaw[];
	meta?: Record<string | number | symbol, unknown>;
}

export const routes: Array<RouteRecordRaw> = [
	{
		path: '/',
		name: "home",
		element: <Home/>,
		meta: {
			needAuth: false,
		},
	}
]
