import React from 'react';
import {Card, Flex} from "antd";
import {TeamTable} from "./tables/TeamTable";
import {PlayerTable} from "./tables/PlayerTable";

export const FETCH_BASE_URL = process.env.REACT_APP_FETCH_BASE_URL ?? '';

export function App() {
    return <>
        <Flex vertical align="center" style={{height: '100vh', padding: '0 100px', backgroundColor: '#c1ded4'}}>
            <Card title="Teams" size="default" style={{width: '100%', margin: '50px  100px'}} hoverable>
                <TeamTable/>
            </Card>
            <Card title="Players" size="default" style={{width: '100%', margin: '0 100px'}} hoverable>
                <PlayerTable/>
            </Card>
        </Flex>
    </>;
}
